package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc(String artist) {
		this.artist = artist;
	}
	
	public CompactDisc(String artist, String title) {
		super(title);
		this.artist = artist;
	}
	
	public CompactDisc(String artist, String title, String category) {
		super(title, category);
		this.artist = artist;
	}

	public CompactDisc(String artist, String title, String category, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}

	public void addTrack(Track track) {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).equals(track)) {
				System.out.println("Duplicated track!");
				return;
			}
		}
		tracks.add(track);
		System.out.println("Add track successful!");
	}
	
	public void removeTrack(Track track) {
		for(int i = 0; i < tracks.size(); ++i) {
			if(tracks.get(i).equals(track)) {
				tracks.remove(track);
				System.out.println("Remove track successful!");
				return;
			}
		}
		System.out.println("Track does not exist!");
	}

	@Override
	public int getLength() {
		int cdLen = 0;
		for(int i = 0; i < tracks.size(); ++i) {
			cdLen += tracks.get(i).getLength();
		}
		return cdLen;
	}

	public static void getCD() {
		
	}
	

	public void play() {
		System.out.println("Title : " + getTitle());
		System.out.println("Artist : " + getArtist());
		System.out.println("Length : " + getLength());
		if(tracks.isEmpty())
			System.out.println("No track!");
		else 
			for(int i = 0; i < tracks.size(); ++i) {
				tracks.get(i).play();
			}
	}
	
}
