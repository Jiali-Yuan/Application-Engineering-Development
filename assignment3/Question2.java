class Question2 {
	public static void main(String[] args) {
		Psychiatrist p = new Psychiatrist();
			Happy h = new Happy();
			Sad s = new Sad();
			p.examine(h);
			h.expressFeelings();
			p.observe(h);
			p.examine(s);
			s.expressFeelings();
			p.observe(s);
	}
}

abstract class Moody {
	protected abstract String getMood();
	protected abstract void expressFeelings();
	public void queryMood() {
		System.out.println("I feel " + getMood() + " today!");
	}
}

class Psychiatrist {
	public void examine (Moody moody) {
		System.out.println("How are you feeling today?");
		moody.queryMood();
	}
	public void observe (Moody moody) {
		System.out.println("Observation: " + moody.toString());
	}
}

class Happy extends Moody {
	@Override
	protected String getMood() {
		String mood = "happy";
		return mood;
	}

	@Override
	public void expressFeelings() {
		System.out.println("hehehe……hahahah……HAHAHAHAHA!!!");
	}

	public String toString() {
		return "Subject laughs a lot!";
	}
}

class Sad extends Moody {
	@Override
	protected String getMood() {
		String mood = "sad";
		return mood;
	}

	@Override
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}

	public String toString() {
		return "Subject cries a lot!";
	}
}