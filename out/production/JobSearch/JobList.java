//
// JobList
//

import java.util.ArrayList;

public class JobList {
    private String name;
    private ArrayList<Job> jobList;
    private ArrayList<Job> appliedList;
    private ArrayList<Job> notAppliedList;

    public JobList(String name) {
        this.name = name;
        this.jobList = new ArrayList();
        this.appliedList = new ArrayList();
        this.notAppliedList = new ArrayList();
    }
}
