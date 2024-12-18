package org.example.entity;

public final class Magazine extends LibraryItem{

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    private int issueNumber;

    public Magazine(int id, String title, int publicationYear, int issueNumber) {
        super(id, title, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails(){
        return "id: "+ super.getId()
                +", titre: "+ super.getTitle()+", Date de publication: "+
                super.getPublicationYear()+
                ", Num de Magazine: "+ getIssueNumber();
    }
}
