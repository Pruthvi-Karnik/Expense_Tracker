package libraryManagementSystem.items;

import libraryManagementSystem.blueprint.item;

public class magazines extends item {
    protected int issueNo;
    public magazines(String title, int issueNo) {
        super(title);
        this.issueNo=issueNo;
    }

    public magazines() {

    }
}
