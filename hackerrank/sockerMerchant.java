public static int sockMerchant(int n, List<Integer> ar) {
    int pairs = 0;
    int i = ar.size()-1;
    while( ar.size()>=2){
        i=ar.size()-1;
        System.out.println("next : "+ar.get(i));
            for(int j = i-1; j>=0; j--){
            if(ar.get(i) == ar.get(j)){
                System.out.println("pair = "+i+", "+j);
                pairs++;
                ar.remove(i);
                ar.remove(j);
                i=i-2;
                break;
                
            }else{
                System.out.println(i+", "+j);
            }
            if(!ar.isEmpty() && i>=0 && j==0 && ar.get(i) != ar.get(j) ){
                ar.remove(i);
            }
        }
        
        
        i--;
      }
      System.out.println(pairs);
     return pairs;