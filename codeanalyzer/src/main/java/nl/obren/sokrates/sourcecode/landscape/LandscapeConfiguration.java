/*
 * Copyright (c) 2020 Željko Obrenović. All rights reserved.
 */

package nl.obren.sokrates.sourcecode.landscape;

import nl.obren.sokrates.sourcecode.Metadata;

import java.util.ArrayList;
import java.util.List;

public class LandscapeConfiguration {
    private Metadata metadata = new Metadata();
    private String analysisRoot = "";
    private String projectReportsUrlPrefix = "../";
    private String parentUrl = "";

    private int extensionThresholdLoc = 0;
    private int projectThresholdLocMain = 0;
    private int projectThresholdContributors = 2;
    private int contributorThresholdCommits = 2;
    private boolean anonymizeContributors = false;

    private List<CustomMetric> customMetrics = new ArrayList<>();
    private List<CustomMetric> customMetricsSmall = new ArrayList<>();
    private CustomTagsConfig tags = new CustomTagsConfig();

    private List<SubLandscapeLink> subLandscapes = new ArrayList<>();
    private List<SokratesProjectLink> projects = new ArrayList<>();

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getAnalysisRoot() {
        return analysisRoot;
    }

    public void setAnalysisRoot(String analysisRoot) {
        this.analysisRoot = analysisRoot;
    }

    public String getProjectReportsUrlPrefix() {
        return projectReportsUrlPrefix;
    }

    public void setProjectReportsUrlPrefix(String projectReportsUrlPrefix) {
        this.projectReportsUrlPrefix = projectReportsUrlPrefix;
    }

    public List<SubLandscapeLink> getSubLandscapes() {
        return subLandscapes;
    }

    public void setSubLandscapes(List<SubLandscapeLink> subLandscapes) {
        this.subLandscapes = subLandscapes;
    }

    public List<SokratesProjectLink> getProjects() {
        return projects;
    }

    public void setProjects(List<SokratesProjectLink> projects) {
        this.projects = projects;
    }

    public int getExtensionThresholdLoc() {
        return extensionThresholdLoc;
    }

    public void setExtensionThresholdLoc(int extensionThresholdLoc) {
        this.extensionThresholdLoc = extensionThresholdLoc;
    }

    public int getProjectThresholdLocMain() {
        return projectThresholdLocMain;
    }

    public void setProjectThresholdLocMain(int projectThresholdLocMain) {
        this.projectThresholdLocMain = projectThresholdLocMain;
    }

    public int getContributorThresholdCommits() {
        return contributorThresholdCommits;
    }

    public void setContributorThresholdCommits(int contributorThresholdCommits) {
        this.contributorThresholdCommits = contributorThresholdCommits;
    }

    public int getProjectThresholdContributors() {
        return projectThresholdContributors;
    }

    public void setProjectThresholdContributors(int projectThresholdContributors) {
        this.projectThresholdContributors = projectThresholdContributors;
    }

    public String getParentUrl() {
        return parentUrl;
    }

    public void setParentUrl(String parentUrl) {
        this.parentUrl = parentUrl;
    }

    public List<CustomMetric> getCustomMetrics() {
        return customMetrics;
    }

    public void setCustomMetrics(List<CustomMetric> customMetrics) {
        this.customMetrics = customMetrics;
    }

    public List<CustomMetric> getCustomMetricsSmall() {
        return customMetricsSmall;
    }

    public void setCustomMetricsSmall(List<CustomMetric> customMetricsSmall) {
        this.customMetricsSmall = customMetricsSmall;
    }

    public CustomTagsConfig getTags() {
        return tags;
    }

    public void setTags(CustomTagsConfig tags) {
        this.tags = tags;
    }

    public boolean isAnonymizeContributors() {
        return anonymizeContributors;
    }

    public void setAnonymizeContributors(boolean anonymizeContributors) {
        this.anonymizeContributors = anonymizeContributors;
    }
}
