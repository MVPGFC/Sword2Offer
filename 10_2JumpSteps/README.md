题目描述：
   一只青蛙一次可以跳上1级台阶，也可以跳上2级。
   求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
   
解题思路：
    假设一个台阶，1种, f(1) = 1
    假设两个台阶，2种, f(2) = 2
    假设三个台阶，比两个台阶多了一个，那就先迈一个台阶，就变成了两个台阶的情况了；
                                    那要是先迈俩台阶，就变成了一个台阶的情况了；
    所以 f(3) = f(1) + f(2);
    假设四个台阶，那就先迈一个台阶，变成了三个台阶的情况了；
                 那要是先迈俩台阶，就变成了两个台阶的情况了；
    所以 f(4) = f(2) + f(3)
    …………
    f(n) = f(n-2) + f(n-1)                           
    