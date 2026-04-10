package org.APCSLowell;

import java.util.ArrayList;

public class Digits {
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number
     */
    public ArrayList<Integer> digits;

    /** Constructs a `Digits` object that represents `num`.
     *  *Precondition*: `num >= 0`
     */
    public Digits(int num) {
        digits = new ArrayList<Integer>();

        if (num == 0) {
            digits.add(0);
        } else {
            String nums = num + "";
            for (int i = 0; i < nums.length(); i++) {
                digits.add(Integer.parseInt(nums.substring(i, i + 1)));
            }
        }
    }

    /** Returns `true` if the digits in this `Digits` object are in strictly increasing order;
     *      `false` otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digits.size()-1; i++) {
            if (digits.get(i) > digits.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
