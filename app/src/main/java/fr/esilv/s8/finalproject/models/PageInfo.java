package fr.esilv.s8.finalproject.models;

/**
 * Created by hugoalix on 22/03/2017.
 */

public class PageInfo {

    private Integer totalResults;
    private Integer resultsPerPage;

    public PageInfo(Integer totalResults, Integer resultsPerPage) {
        this.totalResults = totalResults;
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }
}
