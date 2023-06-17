package org.murismo.services;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.murismo.models.Results;

import java.io.IOException;

public class GetResults {

    public static Results call() throws IOException {

        Document doc = Jsoup.connect("https://www.mtgo.com/en/mtgo/decklist/modern-league-2023-06-16").get();

        var ele = doc.selectFirst("script:containsData(window.MTGO.decklists.data)");

        if (ele == null) {
            throw new IOException("Could not get MTGO data");
        }
        String scriptText = ele.html();
        String data = scriptText
                .replace("window.MTGO = window.MTGO || {};", "")
                .replace("window.MTGO.decklists = window.MTGO.decklists || {};", "")
                .replace("window.MTGO.decklists.data =", "")
                .replace("""
                            window.MTGO.decklists.roundNames = [
                                'Final',
                                'Semifinals',
                                'Quarterfinals',
                                'Eighth-finals',
                                '16th-finals',
                                '32nd-finals',
                                '64th-finals'
                            ];\
                        """, "")
                .replace(";", "")
                .trim();
        Gson g = new Gson();
        return g.fromJson(data, Results.class);
    }
}
