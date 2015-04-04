/*
All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
*/
public class Solution {
	int convertInt(char[]  str,int start)
	{
		int w = 0;
		for(int i = 0;i<10;i++)
		{
			w = w<<2;
			if(str[start+i] == 'A')
			{
				w += 0;
			}
			else if(str[start+i] == 'C')
			{
				w += 1;
			}
			else if(str[start+i] == 'G')
			{
				w += 2;
			}
			else if(str[start+i] == 'T')
			{
				w += 3;
			}
			else
			{
				return -1;
			}

		}
		return w;
	}
	String convertStr(int w)
	{
		char[] arr = new char[10];
		char x;
		int k = 0;
		for(int i = 0; i< 10;i++)
		{
			
			k = w&3;
			if(k == 0)
			{
				x = 'A';
			}
			else if(k == 1)
			{
				x = 'C';
			}
			else if(k == 2)
			{
				x = 'G';
			}
			else
			{
				x = 'T';
			}
			arr[9 - i] = x;
			w = w>>2;
					
		}
		return new String(arr);
	}
    public List<String> findRepeatedDnaSequences(String s) 
    {
    	char[] str = s.toCharArray();
    	HashSet<Integer> set = new HashSet<Integer>();
    	HashSet<Integer> res = new HashSet<Integer>();
    	for(int i  = 0;i <= s.length()-10;i++)
    	{
            int w = convertInt(str,i);
    		if(set.contains(w))
    		{
    			res.add(w);
    		}
    		else
    		{
    			set.add(w);
    		}
    	}    
    	Iterator<Integer> it = res.iterator();
    	LinkedList<String> ls = new LinkedList<String>();
    	while(it.hasNext())
    	{
    		ls.add(convertStr(it.next()));
    	}
    	return ls;
    }
}
