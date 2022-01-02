package th.pro.first.vo;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;
@Component("boardVO")
public class BoardVO {
	private int index;
	private String boardTitle;
	private String boardBody;
	private String id;
	private int viewCount;
	private int boardRecommend;
	private int boardNotRecommend;
	private String boardCategory;
	private Data timtstamp;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardBody() {
		return boardBody;
	}
	public void setBoardBody(String boardBody) {
		this.boardBody = boardBody;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getBoardRecommend() {
		return boardRecommend;
	}
	public void setBoardRecommend(int boardRecommend) {
		this.boardRecommend = boardRecommend;
	}
	public int getBoardNotRecommend() {
		return boardNotRecommend;
	}
	public void setBoardNotRecommend(int boardNotRecommend) {
		this.boardNotRecommend = boardNotRecommend;
	}
	public String getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}
	public Data getTimtstamp() {
		return timtstamp;
	}
	public void setTimtstamp(Data timtstamp) {
		this.timtstamp = timtstamp;
	}
	@Override
	public String toString() {
		return "BoardVO [index=" + index + ", boardTitle=" + boardTitle + ", boardBody=" + boardBody + ", id=" + id
				+ ", viewCount=" + viewCount + ", boardRecommend=" + boardRecommend + ", boardNotRecommend="
				+ boardNotRecommend + ", boardCategory=" + boardCategory + ", timtstamp=" + timtstamp + "]";
	}
	
	
}
