import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
 
public class SubstringQueries {
 
            public static void main(String[] args) throws Exception 
            {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
                        int numoftcs=Integer.parseInt(br.readLine());
                       
                        System.out.println("numoftcs "+numoftcs);  
                                   
                        if (numoftcs<1 || numoftcs>3)
                                    return;
                       
                        ArrayList<String> querystrings;
                       
                        while(numoftcs>0)
                        {
                                    String mainstr=br.readLine();
                                    if (mainstr==null || mainstr.length()<1 ||mainstr.length()>100000)
                                                return;
                                   
                                    int querycount=Integer.parseInt(br.readLine());
                                   
                                   
                                    for (int i=0;i<querycount;i++)
                                    {  
                                                String querystring=br.readLine();
                                                if (querystring.length()<1 || querystring.length()>200)
                                                            return;
                                               
                                                if(querystring.matches("^.*[^a-zA-Z0-9].*$"))
                                                            return;
                                               
                                               // if (duplicate(querystring))
                                                //            return;
                                               
            
                                               System.out.println(countAnagrams(mainstr,querystring));
                                    }
                                   
                                   
                                   
                                   
                        }
            }
 
            private static int countAnagrams(String mainstr, String querystring) 
            {
                int anagramCount=0;
                
            	for(int i=0;i<mainstr.length();i++)
            	{           		
            		for(int j=i+1;j<=mainstr.length();j++)
            		{
            			String substr=mainstr.substring(i, j);
            			//System.out.println(substr);
            			
            			boolean isAnagram=true;
            			for(int k=0;k<querystring.length();k++){
            				isAnagram=(substr.indexOf(querystring.charAt(k))!=-1)?true:false;
            				if(!isAnagram)
            					break;
            			}		
            			
            			if (isAnagram)
            				anagramCount++;
            		}
            		
            	}
                    
            	return anagramCount;
            }
 
            private static boolean duplicate(String querystring) 
            {
                         
                        return false;
            }
 
}
 