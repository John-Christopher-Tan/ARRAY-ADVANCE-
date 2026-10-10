
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.advance;

import java.util.Arrays;

public class ARRAYADVANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};
        int target = 90;
        int targetIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex != -1) {
            System.out.println("Target " + target + " found at index: " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        int[] scoresCopy = Arrays.copyOf(scores, scores.length);
        Arrays.sort(scoresCopy);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Copy: " + Arrays.toString(scoresCopy));
    }
}

