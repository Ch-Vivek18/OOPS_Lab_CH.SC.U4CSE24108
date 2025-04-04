class Student {
    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks entered!");
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student("Vivek");
        s.setMarks(85);
        System.out.println(s.getName() + "'s Marks: " + s.getMarks());
    }
}
