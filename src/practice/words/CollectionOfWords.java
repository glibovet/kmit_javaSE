package practice.words;
public class CollectionOfWords {
	private Word[] myWords;
	int count;
	int totalCount;
	
	public CollectionOfWords(){
		this.myWords = new Word[2];
	}
	
	private void resizeArray(int size){
		Word[] temp = new Word[size];
		int tSize = 0;
		if (size>myWords.length)
			tSize = myWords.length;
		else
			tSize = size;
		for (int i=0;i<tSize;i++){
			temp[i] = myWords[i];
		}
		this.myWords = temp;
	}
	
	public void addWord(String word){
		totalCount++;
		if (count>=myWords.length){
			resizeArray(myWords.length*2);
		}
		int pos = positionOfWord(word);
		if (pos>-1){
			myWords[pos].addWord();
		}else{
			Word temp = new Word(word);
			myWords[count++]=temp;
		}
	}

	public int positionOfWord(String word){
		int res = -1;
		
		for(int i = 0; i<count;i++){
			if (myWords[i].getWord().equals(word)){
				res = i;
				break;
			}
		}
		
		return res;
	}
	
	public Word[] sortedWords(){
		Word[] temp = new Word[count];
		for (int i = 0; i< count;i++)
			temp[i] = myWords[i];
		for (int i=0;i<count-1;i++){
			for (int j = 0; j<count-1-i;j++){
				if (temp[j].getWord().compareTo(temp[j+1].getWord())>0){
					swap(temp,j,j+1);
				}
			}
		}
		return temp;
	}
	
	private void swap(Word[] mas, int i, int j){
		Word temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;
	}
	
	public String toString(){
		String res ="";
		res+="Total count of words = "+totalCount+"\n";
		res+="Uniq words = "+count+"\n";
		Word[] temp = sortedWords();
		for (int i=0;i<count;i++){
			res+=temp[i].toString()+"\n";
		}
		return res;
	}
}
