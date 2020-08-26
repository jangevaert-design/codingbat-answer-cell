public class answerCell {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    return ((!isMorning && !isAsleep) || (isMorning && isMom && !isAsleep));
  }

}
