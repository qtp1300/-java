package test001;


















57.                     break; 58.                 }case 'B':{ 
59.                     st.append("1011"); 60.                     break; 61.                 }case 'C':{ 62.                  
63.                     st.append("1100"); 64.                     break; 65.                 } 
66.                 case 'D':{ 
67.                     st.append("1101"); 68.                     break; 69.                 } 
70.                 case 'E':{ 
71.                     st.append("1110"); 72.                     break; 73.                 } 
74.                 case 'F':{ 
75.                     st.append("1111"); 76.                     break; 77.                 } 78.             } 79.  
80.         } 
81.         transform_02(st); 82. } 
83.    public static void transform_02(StringBuffer s){ 84.     int i=s.length(); 85.     if(i%3==0){ 86.          
87.         if(s.substring(0,3).equals("000")) 88.                 s.delete(0,3); 89.              90.     } 
91.     if(i%3==1){ 
92.         if(s.substring(0,1).equals("0")) 93.         s.delete(0,1); 94.      95.      96.     else 
97.             s.insert(0,"00"); 98.          99.      100.     } 









101.         if(i%3==2){ 
102.             if(s.substring(0,2).equals("00")) 103.                 s.delete(0,2); 104.                105.              106.         else 
107.             s.insert(0,"0"); 108.          109.          110.          111.     } 112.      
113.         int n=s.length()/3; 
114.             String s1[]=new String[n]; 
115.         StringBuffer sbf=new StringBuffer(); 116.     for(int j=0;j<n;j++){ 
117.      s1[j]=s.substring(j*3,j*3+3); 118.      if(s1[j].equals("000")) 119.         sbf.append("0"); 
120.         if(s1[j].equals("001")) 121.         sbf.append("1"); 
122.         if(s1[j].equals("010")) 123.         sbf.append("2"); 
124.         if(s1[j].equals("011")) 125.         sbf.append("3"); 
126.         if(s1[j].equals("100")) 127.         sbf.append("4"); 
128.         if(s1[j].equals("101")) 129.         sbf.append("5"); 
130.         if(s1[j].equals("110")) 131.         sbf.append("6"); 
132.         if(s1[j].equals("111")) 133.         sbf.append("7"); 134.       135.       136.     } 
137.     String s2=sbf.toString(); 138.     System.out.println(s2); 139.        140.    } 141.     142. }