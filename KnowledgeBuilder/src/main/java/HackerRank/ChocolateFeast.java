package HackerRank;

/*
Little Bobby loves chocolate. He frequently goes to his favorite 5 & 10 store, Penny Auntie, to buy them.
 They are having a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a
 free chocolate.
 Complete the chocolateFeast function in the code stub below to return the number of chocolates Bobby
 can eat with a given amount of money after taking full advantage of the promotion.
 
 Note: Little Bobby will always turn in his wrappers if he has enough to get a free chocolate.
 
 Input Format

Each of the next lines contains three space-separated integers: They represent money to
spend (money), the cost of a chocolate (cost), and the number of wrappers he can turn in for a free chocolate (numWrap).

*/


public class ChocolateFeast {

    static int chocolateFeast(int money, int cost, int numWrap) {
        int chocCount = money / cost;
        int wrappers = money / cost;
        while (wrappers >= numWrap) {
            chocCount += wrappers / numWrap;
            wrappers = (wrappers / numWrap) + (wrappers % numWrap);
        }
        return chocCount;
    }
}
