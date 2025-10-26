class Bank {
    HashMap<Integer, Long> acc_holder;
    public Bank(long[] balance) {
        acc_holder = new HashMap<>();
        int i=1;
        for(long b: balance){
          acc_holder.put(i, acc_holder.getOrDefault(i,(long) 0)+b);
          i++;
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!acc_holder.containsKey(account1) || acc_holder.get(account1)<money) return false;
        if(!acc_holder.containsKey(account2)) return false;

        acc_holder.put(account1, acc_holder.get(account1)-money);
        acc_holder.put(account2, acc_holder.get(account2)+money);
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!acc_holder.containsKey(account)) return false;

        acc_holder.put(account, acc_holder.get(account)+money);
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!acc_holder.containsKey(account) || acc_holder.get(account)<money) return false;

        acc_holder.put(account, acc_holder.get(account)-money);
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */