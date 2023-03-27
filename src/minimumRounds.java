import java.util.Arrays;

public class minimumRounds {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4,4,4,4};
//                    [5,5,5,5]
//                    [5,5,5,5,5,5,5,5,5,5]

        // Sort the tasks array in ascending order
        Arrays.sort(tasks);
        int result = 0, count = 0;
        // Iterate through each task
        for (int i = 0; i < tasks.length; i++) {
            // Increment the count of tasks with the same value
            count++;
            // If we have reached the last task or the current task is different from the next task
            if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]) {
                // If there is only one task with this value, we cannot create groups of 3
                // and we return -1
                if (count == 1) {
                    System.out.println(-1);
                    break;
                }
                // Add the number of full groups of 3 we can create from the tasks with this value
                result += count / 3;
                // If there are remaining tasks that cannot be included in a group of 3,
                // we need one more round to process these tasks
                if(count % 3 != 0) result++;
                // Reset the count for the next set of tasks
                count = 0;
            }
        }
        // Return the total number of rounds needed
        System.out.println(result);
    }
}


//
//
//            if(count <  4){
//
//        if( i != tasks.length-1 &&  tasks[i] == tasks[i+1]){
//        count++;
//        }
//        if(i+1 != tasks.length && tasks[i] == tasks[i+1] && tasks[i+1] == tasks[i+2]){
//        answer++;
//        count = 1;
//
//        }
//        else{
//        if(count < 2){
//        System.out.println(-1);
//        break;
//        }
//        if(count == 2){
//        answer++;
//        }
//        count = 1;
////
//        }
//        }else{
//
//        if(count == 3){
//        answer++;
//        }
//        count = 1;
////                answer++;
//        }
//


