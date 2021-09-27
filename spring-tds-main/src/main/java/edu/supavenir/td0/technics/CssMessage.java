package edu.supavenir.td0.technics;

public class CssMessage {
	private String content;
	private String type;
	private String icon;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public CssMessage(String content, String type, String icon) {
		this.content = content;
		this.type = type;
		this.icon = icon;
	}

	public static CssMessage SuccessMessage(String content) {
		return new CssMessage(content, "success", "check");
	}

	public static CssMessage ErrorMessage(String content) {
		return new CssMessage(content, "error", "exclamation circle");
	}
}
