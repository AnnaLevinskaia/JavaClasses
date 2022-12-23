package class22;

public class StudentTesterTask1 {
    public static void main(String[] args) {
        Student[] arr={new CollegeStudent(),
                new SchoolStudent(),new SyntaxStudent()};

        for (Student st:arr
        ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
