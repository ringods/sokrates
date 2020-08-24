/*
 * Copyright (c) 2019 Željko Obrenović. All rights reserved.
 */

package nl.obren.sokrates.sourcecode.cleaners;

import java.util.ArrayList;
import java.util.List;

public class CleanedContent {
    private String cleanedContent;
    private List<Integer> fileLineIndexes = new ArrayList<>();

    public CleanedContent(String cleanedContent, List<Integer> fileLineIndexes) {
        this.cleanedContent = cleanedContent;
        this.fileLineIndexes = fileLineIndexes;
    }

    public int getCleanedLinesCount() {
        return fileLineIndexes.size();
    }    

    public String getCleanedContent() {
        return cleanedContent;
    }

    public List<Integer> getFileLineIndexes() {
        return fileLineIndexes;
    }

    public List<String> getLines() {
        return SourceCodeCleanerUtils.splitInLines(cleanedContent);
    }
}
