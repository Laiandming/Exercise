package nowcode;
//leetcode题号-1370
//        给你一个字符串 s ，请你根据下面的算法重新构造字符串：
//
//        从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
//        从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
//        重复步骤 2 ，直到你没法从 s 中选择字符。
//        从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
//        从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
//        重复步骤 5 ，直到你没法从 s 中选择字符。
//        重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
//        在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。
//
//        请你返回将 s 中字符重新排序后的 结果字符串 。

public class LC1370 {
    public String sortString(String s){
        int[] num = new int[26];
        for(int i=0; i<s.length(); i++){
//            charAt方法用于返回索引处的字符，用于记录输入字符串的a-z的字母个数
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer ret = new StringBuffer();
        while(ret.length() < s.length()){
            for (int i =0; i<26; i++){
                if (num[i]>0){
                    ret.append((char)(i + 'a'));
                    num[i]--;
                }
            }
            for(int i=25; i>=0; i--){
                if(num[i]>0){
                    ret.append((char)(i + 'a'));
                    num[i]--;
                }
            }
        }
        return ret.toString();
    }


    public static void main(String[] args){
        LC1370 solution = new LC1370();
        System.out.println(solution.sortString("aaaabbbbcccc"));
        System.out.println(solution.sortString("rat"));
        System.out.println(solution.sortString("leetcode"));
        System.out.println(solution.sortString("ggggggg"));
        System.out.println(solution.sortString("spo"));
    }
}