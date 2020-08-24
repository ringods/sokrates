/*
 * Copyright (c) 2019 Željko Obrenović. All rights reserved.
 */

package nl.obren.sokrates.sourcecode.duplication;

import nl.obren.sokrates.common.utils.ProgressFeedback;
import nl.obren.sokrates.sourcecode.SourceFile;
import nl.obren.sokrates.sourcecode.cleaners.CleanedContent;
import nl.obren.sokrates.sourcecode.duplication.impl.Blocks;
import nl.obren.sokrates.sourcecode.duplication.impl.Files;
import nl.obren.sokrates.sourcecode.lang.LanguageAnalyzer;
import nl.obren.sokrates.sourcecode.lang.LanguageAnalyzerFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DuplicationEngine {
    private static final Log LOG = LogFactory.getLog(DuplicationEngine.class);

    private int threshold = 6;

    private int totalCleanedLinesOfCode = 0;
    private int numberOfDuplicatedLines;

    public List<DuplicationInstance> findDuplicates(List<SourceFile> sourceFiles, ProgressFeedback progressFeedback) {
        Files files = new Files(progressFeedback);
        files.addAll(sourceFiles);

        Blocks blocks = new Blocks(files, threshold);
        List<DuplicationInstance> duplicates = blocks.extractDuplicatedBlocks(progressFeedback);

        totalCleanedLinesOfCode = files.getTotalCleanedLinesOfCode();

        numberOfDuplicatedLines = DuplicationUtils.getNumberOfDuplicatedLines(duplicates);

        return duplicates;
    }

    public int getTotalCleanedLinesOfCode() {
        return totalCleanedLinesOfCode;
    }

    public void setTotalCleanedLinesOfCode(int totalCleanedLinesOfCode) {
        this.totalCleanedLinesOfCode = totalCleanedLinesOfCode;
    }

    public int getNumberOfDuplicatedLines() {
        return numberOfDuplicatedLines;
    }
}
