int myAtoi(char* str) {
  long long cur=0;//��ʼ����������
    int num=0,i=0;
    int flag1=0,flag2=0;
    while(str[i]!='\0' && str[i]==' ') i++;//��ͷ�ո�����
    if(str[i]=='-') flag1++,i++;
    else if(str[i]=='+') flag2++,i++;
    for(; str[i]!='\0'; i++)
    {
        if(str[i]>='0' && str[i]<='9')
        {
            if(flag1==2)
            {
                cur=cur*10-(str[i]-'0');//�����Ǽ�������Ϊcur�����Ǹ�����
                if(cur<-2147483648) return -2147483648;
            }
            else if(flag1==1) cur=-str[i]+'0',flag1++;//�������ķ��ż�¼��cur��
            else
            {
                cur=cur*10+(str[i]-'0');
                if(cur>2147483647) return 2147483647;
            }
        }
        else break;
    }
    num=(int)cur;
    return num;
}
