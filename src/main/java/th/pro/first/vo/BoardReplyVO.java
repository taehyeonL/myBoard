package th.pro.first.vo;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;
@Component("boardRPVO")
public class BoardReplyVO {
	private int boardReplyIndex;
	private int boardIndex;
	private String replyBody;
	private String id;
	private int replyRecommend;
	private int replyNotRecommend;
	private Data timestamp;
	public int getBoardReplyIndex() {
		return boardReplyIndex;
	}
	public void setBoardReplyIndex(int boardReplyIndex) {
		this.boardReplyIndex = boardReplyIndex;
	}
	public int getBoardIndex() {
		return boardIndex;
	}
	public void setBoardIndex(int boardIndex) {
		this.boardIndex = boardIndex;
	}
	public String getReplyBody() {
		return replyBody;
	}
	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getReplyRecommend() {
		return replyRecommend;
	}
	public void setReplyRecommend(int replyRecommend) {
		this.replyRecommend = replyRecommend;
	}
	public int getReplyNotRecommend() {
		return replyNotRecommend;
	}
	public void setReplyNotRecommend(int replyNotRecommend) {
		this.replyNotRecommend = replyNotRecommend;
	}
	public Data getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Data timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "BoardReplyVO [boardReplyIndex=" + boardReplyIndex + ", boardIndex=" + boardIndex + ", replyBody="
				+ replyBody + ", id=" + id + ", replyRecommend=" + replyRecommend + ", replyNotRecommend="
				+ replyNotRecommend + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
