/*
2. 노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
    - 노래의 제목을 나타내는 title
    - 가수를 나타내는 artist
    - 노래가 발표된 연도를 나타내는 year
    - 국적을 나타내는 country
    또한 Song 클래스에 다음 생성자와 메소드를 작성하라.

    - 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
    - 노래 정보를 출력하는 show() 메소드
    - main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
        song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
        1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
 */
class Song {
    String title;
    String artist;
    String year;
    String country;

    public String getTitle() {
        return title;
    }

    public void setTitle(String a) {
        this.title = a;
    }

    public String setArtist(String b) {
        this.artist = b;
        return artist;
    }

    public String setYear(String c) {
        this.year = c;
        return year;
    }

    public String setCountry(String d) {
        this.country = d;
        return country;
    }
}

public class exam2 {
    public static void main(String[] args) {
        Song song = new Song();

        song.setTitle("Dancing Queen");
        song.setArtist("ABBA");
        song.setYear("1978년");
        song.setCountry("스웨덴");

//        1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
        System.out.println(song.setYear(song.year)
                + " " + song.setCountry(song.country) + " 국적의 "
                + song.setArtist(song.artist) + "가 부른 "
                + song.getTitle());
    }
}
