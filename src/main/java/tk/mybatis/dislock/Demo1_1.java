package tk.mybatis.dislock;
//GETSET
public class Demo1_1 {
   void tryLock(){
//        NewExpireTime=CurrentTimestamp+ExpireSeconds
//        if(SETNX Key NewExpireTime Seconds){
//            oldExpireTime = GET(Key)
//            if( oldExpireTime < CurrentTimestamp){
//                NewExpireTime=CurrentTimestamp+ExpireSeconds
//                CurrentExpireTime=GETSET(Key,NewExpireTime)
//                if(CurrentExpireTime == oldExpireTime){
//                    return 1;
//                }else{
//                    return 0;
//                }
//            }
//        }
    }
   public void  release(){
//        DELETE Key
    }
}
