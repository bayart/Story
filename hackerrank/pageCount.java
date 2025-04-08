public static int pageCount(int n, int p) {
    int turnRight = 0;
    int turnLeft = 0;
    
    if(p % 2 ==0){
        turnLeft = p/2;
    }else{
        turnLeft = Math.floorDiv(p, 2);
    }     

    System.out.println("from -1 :"+ turnLeft);
    
    if((n -p) == 1 && p % 2 !=0){
        turnRight = n-p;
    }else{
        turnRight = Math.floorDiv((n-p), 2);
    } 

    System.out.println("from end: "+ turnRight);
    
    
    if (turnLeft < turnRight){
       return turnLeft; 
    }else{
        return turnRight;
    }