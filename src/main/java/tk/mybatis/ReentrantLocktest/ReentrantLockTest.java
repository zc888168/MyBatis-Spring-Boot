package tk.mybatis.ReentrantLocktest;

public class ReentrantLockTest {
    final boolean nonfairTryAcquire(int acquires) {
//        final Thread current = Thread.currentThread();
//        int c = getState();
//        if (c == 0) {
//            if (compareAndSetState(0, acquires)) {
//                setExclusiveOwnerThread(current);
//                return true;
//            }
//        }
//        else if (current == getExclusiveOwnerThread()) {
//            int nextc = c + acquires;
//            if (nextc < 0) // overflow
//                throw new Error("Maximum lock count exceeded");
//            setState(nextc);
//            return true;
//        }
//        return false;
        return false;
    }
//    final boolean acquireQueued(final Node node, int arg) {
//        boolean failed = true;
//        try {
//            boolean interrupted = false;
//            for (;;) {
//                final Node p = node.predecessor();
//                if (p == head && tryAcquire(arg)) {
//                    setHead(node);
//                    p.next = null; // help GC
//                    failed = false;
//                    return interrupted;
//                }
//                if (shouldParkAfterFailedAcquire(p, node) &&
//                        parkAndCheckInterrupt())
//                    interrupted = true;
//            }
//        } finally {
//            if (failed)
//                cancelAcquire(node);
//        }
//    }
//    private final boolean parkAndCheckInterrupt() {
//        LockSupport.park(this);
//        return Thread.interrupted();
//    }


}
