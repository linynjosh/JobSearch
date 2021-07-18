//
// Java file
//

public class Job {
    private String title;
    private String description;
    private ArrayList<String> keyInfo; // info like wages etc. for sorting in job list
    private boolean applied;

    // constructor
    public Job(String title, String description, boolean applied) {
        this.title = title;
        this.description = description;
        this.applied = false;
        this.keyInfo.getKeyinfo();
    }

    // get the title of the job
    public String getTitle() {
        return this.title;
    }

    // get the description of the job
    public String getDescription() {
        return this.description;
    }

    // get the application status
    public void setApplied() {
        this.applied = true;
    }

    // apply for the job
    public boolean applied() {
        return this.applied;
    }

    // get the key informaiton of the job
    public void getKeyinfo() {

    }
}

