//
// Java file
//

public class Job {
    String title;
    String description;
    boolean applied;

    public Job(String title, String description, boolean applied) {
        this.title = title;
        this.description = description;
        this.applied = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setApplied() {
        this.applied = true;
    }

    public boolean applied() {
        return this.applied;
    }
}
