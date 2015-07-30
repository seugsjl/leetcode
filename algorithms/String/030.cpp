/*
1080 ms
*/
class Solution {
public:
    vector<int> findSubstring(string S, vector<string>& L) {
        int l_size = L.size();
        
        if (l_size <= 0) {
            return vector<int>();
        }
        
        vector<int> result;
        map<string, int> word_count;
        int word_size = L[0].size();
        int i, j;
        
        for (i = 0; i < l_size; ++i) {
            ++word_count[L[i]];
        }
        
        map<string, int> counting;
        
        for (i = 0; i <= (int)S.length() - (l_size * word_size); ++i) {
            counting.clear();
            
            for (j = 0; j < l_size; ++j) {
                string word = S.substr(i + j * word_size, word_size);
                
                if (word_count.find(word) != word_count.end()) {
                    ++counting[word];
                    
                    if (counting[word] > word_count[word]) {
                        break;
                    }
                }
                else {
                    break;
                }
            }
            
            if (j == l_size) {
                result.push_back(i);
            }
        }
        
        return result;        
    }
};