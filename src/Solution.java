import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 1){
            return res;
        }
        // 初始化[]   空集是任何集合的子集
        res.add(new ArrayList<>());

        for(int i=0; i < nums.length; i++){
            int size = res.size();
            //遍历所有已存在的子集
            for(int j = 0; j < size; j++){
                List<Integer> list = res.get(j);
                //把自己拿出来，添加上新的元素，组成新的list，在插入res
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(nums[i]);
                res.add(tmpList);
            }
        }
        return res;
    }
}
