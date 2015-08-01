/*
Runtime: 16 ms
*/
class Solution {
public:
    int maximumGap(vector<int>& num) {
        if(num.empty() || num.size() < 2)
            return 0;
        sort(num.begin(), num.end());
        int maxGap = num[1]-num[0];
        for(int i = 2; i < num.size(); i ++)
        {
            int curGap = num[i]-num[i-1];
            maxGap = (maxGap>=curGap)?maxGap:curGap;
        }
        return maxGap;        
    }
};
/*
Runtime: 12 ms
��Դ������
*/
class Solution {
public:
    int maximumGap(vector<int>& num) {
        if (num.size() < 2) 
			return 0;
        // 1. ����õ�Ͱ����ȡƽ��������������ֵ����Сֵ֮����Լ�����õ�Ͱ��
        // ��Ϊ��������ֵ����ƽ���ֲ���ʱ�����ȡͰ���ɵ�ʱ�临�Ӷ���0(n)
        auto maxVal = *max_element(num.begin(), num.end());
        auto minVal = *min_element(num.begin(), num.end());
        int agGap = ceil((double)(maxVal - minVal) / (num.size()-1)); // ƽ�����
        int bucketCount = ceil((double)(maxVal - minVal) / agGap);
        // 2. ��¼ÿ��Ͱ�����ֵ����Сֵ
        vector<pair<int, int> > buckets(bucketCount, make_pair(INT_MIN, INT_MAX)); // ��ʼ��Ͱ
        for (auto val : num){
            if (val == maxVal || val == minVal) continue;
            int bucketNum = (val - minVal) / agGap;
            if (val > buckets[bucketNum].first) 
                buckets[bucketNum].first = val; // �洢���ֵ
            if (val < buckets[bucketNum].second) buckets[bucketNum].second = val; // �洢��Сֵ
        }
        // 3. ��������
        int maxGap(0), lastMax(minVal);
        for (auto bucket : buckets){
            if (bucket.first == INT_MIN) continue; // ��Ͱ
            int curMax(bucket.first), curMin(bucket.second);
            maxGap = max(maxGap, curMin - lastMax);
            lastMax = curMax;
        }
        maxGap = max(maxGap, maxVal - lastMax);
        return maxGap;
    }
};