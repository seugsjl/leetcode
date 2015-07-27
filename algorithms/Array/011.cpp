class Solution {
public:
    int maxArea(vector<int>& height) {
    int capability = 0;
    size_t left = 0, right = height.size() - 1;
    
    while (left < right)
    {
        const int water = 
            min(height[left], height[right]) * (right - left);
        
        if (water > capability) capability = water;
        
        if (height[left] < height[right])
        {
            ++left;
        }
        else
        {
            --right;
        }
    }
    
    return capability;        
    }
};