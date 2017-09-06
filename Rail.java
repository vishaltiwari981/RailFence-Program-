class RailD
 {
   public static void main(String args[])
     {
       String Cipher="wloeecm",c1,c2;
       String plain="";
       
       int ci_len;
       int half_ci_len;        
       int k,i=0,j=0;

         if(Cipher.length()%2==1)
          {
            half_ci_len = Cipher.length()/2;
            half_ci_len += 1;
          }
         else
          {
            half_ci_len = Cipher.length()/2;
          }

       // System.out.println(half_ci_len+"\t"+Cipher.length());          
         c1 = Cipher.substring(0,half_ci_len);         
         c2 = Cipher.substring(half_ci_len,Cipher.length());
                  
         // System.out.println(c2);
         //System.out.println(c1);
         
         int c1_len = c1.length();
         int c2_len = c2.length();
 
         for(k=1;k<=Cipher.length();k++)
           {
              if(k%2==1)
                 {
                    if(i<=c1_len-1)
                        {
                           plain += c1.charAt(i);
                           i++;
                        }
                 }
               else
                 {
                    if(j<=c1_len-1)
                        {
                           plain += c2.charAt(j);
                           j++;
                        }
                 }
           }
   
       System.out.println("PlainText : " + plain.toUpperCase());
      }
 }