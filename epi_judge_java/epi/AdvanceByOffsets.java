package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
import java.util.List;
public class AdvanceByOffsets {
  @EpiTest(testDataFile = "advance_by_offsets.tsv")
  public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
      if(maxAdvanceSteps.size() == 1) return true;
      int currMax = 0;
      for(int i = 0; i< maxAdvanceSteps.size(); i++){
        currMax--;
        currMax = Math.max(currMax, maxAdvanceSteps.get(i));
        if(currMax < 1 && i < maxAdvanceSteps.size()-1) return false;
      }
    return true;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "AdvanceByOffsets.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
