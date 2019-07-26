package org.nexters.cultureland.model.vo;

import javax.persistence.*;
import lombok.*;
import javax.persistence.Table;

@Entity
@Table(name = "culture_rowdata")
@Getter @ToString @NoArgsConstructor
public class CultureRawData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;

	@Column
	private String imageUrl;

	@Column
	private String title;

	@Column
	private String place;

	@Column
	private String date;

	@ManyToOne
	@JoinColumn(name = "id")
	Culture culture;

	public CultureRawData(String imageUrl, String title, String place, String date, Culture culture) {
		this.imageUrl = imageUrl;
		this.title = title;
		this.place = place;
		this.date = date;
		this.culture = culture;
	}

}
