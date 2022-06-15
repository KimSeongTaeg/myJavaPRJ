public class Exam {
    public static void main(String[] args) {
        ExamDTO eDTO = new ExamDTO();

        eDTO.setTest("기말고사");
        eDTO.setScore(100);

        System.out.println("시험 : " + eDTO.getTest());
        System.out.println("점수 : " + eDTO.getScore());
    }
}
