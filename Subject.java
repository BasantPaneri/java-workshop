class Subject{
    private String subId,name;
    private int maxMarks,marksObtained;

    public String getSubId() {return subId;}
    public String getName() {return name;}
    public int getMarksObtained() {return marksObtained;}
    public int getMaxMarks() {return maxMarks;}

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public Subject(String subId,String name,int maxMarks){
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public Subject(String subId,String name,int maxMarks,int marksObtained){
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtained=marksObtained;
    }

    public String toString(){
        return "\nSubject id: "+subId+"\nName: "+name+"\nmaximum marks: "+maxMarks+"\nmarks obtained: "+marksObtained;
    }

    
}

class Subject1{
    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0]=new Subject("s101","english" , 100);
        sub[1]=new Subject("s102", "maths", 100);
        sub[2]=new Subject("s103", "science", 100);

        for(Subject s:sub){
            System.out.println(s);
        }

    }
}