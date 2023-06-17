package org.murismo;

import org.murismo.models.Results;
import org.murismo.services.GetResults;
import org.murismo.services.PrintResults;
import org.murismo.services.SaveResults;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var results = GetResults.call();
        PrintResults.call(results);
        SaveResults.call(results);
    }
}
