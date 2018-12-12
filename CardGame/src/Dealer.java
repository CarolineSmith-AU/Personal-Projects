public interface Dealer<T> {

    boolean contains(T card);

    void dealHand();

    void distributeCardToStack();

    void distributeCardToPlayer(Player player);

    int sizeOfHand();


    int numOfAces();

    int numOfAcesRed();

    int numOfAcesBlack();

    int numOfAcesClubs();

    int numOfAcesHearts();

    int numOfAcesSpades();

    int numOfAcesDiamonds();


    int numOfOnes();

    int numOfOnesRed();

    int numOfOnesBlack();

    int numOfOnesClubs();

    int numOfOnesHearts();

    int numOfOnesSpades();

    int numOfOnesDiamonds();


    int twos();

    int twosRed();

    int twosBlack();

    int twosClubs();

    int twosHearts();

    int twosSpades();

    int twosDiamonds();


    int numOfThrees();

    int numOfThreesRed();

    int numOfThreesBlack();

    int numOfThreesClubs();

    int numOfThreesHearts();

    int numOfThreesSpades();

    int numOfThreesDiamonds();


    int numOfFours();

    int numOfFoursRed();

    int numOfFoursBlack();

    int numOfFoursClubs();

    int numOfFoursHearts();

    int numOfFoursSpades();

    int numOfFoursDiamonds();


    int numOfFives();

    int numOfSixes();

    int numOfSevens();

    int numOfEights();

    int numOfNines();

    int numOfTens();

    int numOfJacks();

    int numOfQueens();

    int numOfKings();

    int numOfJokers();


}
