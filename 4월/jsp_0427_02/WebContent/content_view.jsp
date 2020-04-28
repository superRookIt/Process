<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/read.css">
<meta charset="UTF-8">
<title>뷰페이지</title>
</head>
<body>

	<section>
		<h1>NOTICE</h1>

		<table>

			<colgroup>
				<col width="80%">
				<col width="10%">
				<col width="10%">
			</colgroup>


			<tr>
				<th colspan="3"><strong>번호 : ${content_view.bId}</strong></th>
			</tr>

			<tr>
				<th colspan="3">${content_view.bTitle}</th>
			</tr>

			<tr>
				<td>${content_view.bDate}</td>
				<td>조회수</td>
				<td>${content_view.bHit}</td>
			</tr>

			<tr>
				<td colspan="3" class="article">${content_view.bContent}</td>

			</tr>

			<tr>
				<td colspan="3"><strong>다음글</strong> <span class="separator">|</span>
					[키즈잼] 2월 프로그램 안내</td>
			</tr>

			<tr>
				<td colspan="3"><strong>이전글</strong> <span class="separator">|</span>
					[키즈잼] 2020년 1분기 정기 휴관일 안내</td>
			</tr>

		</table>


		<a href="list.do">
		<div class="list">
			목록
		</div>
		</a>
		
		
		<a href="delete.do?bId=${content_view.bId }">
		<div class="list">
			삭제
		</div>
		</a>
		
		
		<a href="modify.do?bId=${content_view.bId }">
		<div class="list">
			수정
		</div>
		</a>
		
		
		<a href="reply.do?bId=${content_view.bId }">
		<div class="list">
			답글
		</div>
		</a>


	</section>

</body>
</html>