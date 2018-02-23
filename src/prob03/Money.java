package prob03;

public class Money {

	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		return new Money(this.amount + money.getAmount());
	}

	public Money minus(Money money) {
		if(money.getAmount() > this.amount){
			System.out.println("Cannot execute to calculate");
			return null;
		}
		return new Money(this.amount - money.getAmount());
	}

	public Money multiply(Money money) {
		return new Money(this.amount * money.getAmount());
	}

	public Money devide(Money money) {
		if(money.getAmount() == 0){
			System.out.println("Cannot execute to calculate");
			return null;
		}
		return new Money(this.amount / money.getAmount());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		else {
			Money money = (Money)obj;
			if(money.getAmount() != this.amount) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
    
    
}
