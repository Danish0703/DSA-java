1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        Arrays.sort(nums);
5        int n = nums.length;
6        List<List<Integer>> res = new ArrayList<>();
7
8        for (int i = 0; i < n - 3; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1])
11                continue;
12
13            for (int j = i + 1; j < n - 2; j++) {
14
15                if (j > i + 1 && nums[j] == nums[j - 1])
16                    continue;
17
18                int k = j + 1;
19                int l = n - 1;
20
21                while (k < l) {
22
23                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
24
25                    if (sum == target) {
26
27                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
28
29                        while (k < l && nums[k] == nums[k + 1])
30                            k++;
31
32                        while (k < l && nums[l] == nums[l - 1])
33                            l--;
34
35                        k++;
36                        l--;
37
38                    } else if (sum < target) {
39                        k++;
40                    } else {
41                        l--;
42                    }
43                }
44            }
45        }
46
47        return res;
48    }
49}