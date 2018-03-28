<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/DatePicker.js"></script>
	<title>菜品列表</title>
</head>
	<body>
		<div class="row" style="width:98%;margin-left: 1%;">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<div class="panel panel-default">
					<div class="panel-body">
			
						<div style="height: 600px;overflow: scroll;">
							<%--<form action="/updateBox.do" method="post">--%>
							<table id="tb_list" class="table table-striped table-hover table-bordered">
								<tr>
									<td>序号</td><td>房间号</td><td>状态</td><td>操作</td>
								</tr>
								<c:forEach items="${listBox}" var="list">
								<tr>
									<td>${list.roomId}</td>
									<td>${list.roomName}</td>
									<td>
									<c:choose>
										<c:when test="${list.roomStatus== '0'}">
											<a class="btn btn-info">空闲中</a>
										</c:when>
										<c:otherwise>
											<a class="btn btn-danger">使用中</a>
										</c:otherwise>
									</c:choose>
									</td>
									<td>
										<a href="/updateBox.do?roomId=${list.roomId}&roomStatus=0">空闲</a>
										<a href="/updateBox.do?roomId=${list.roomId}&roomStatus=1">使用</a>

									</td>
								</tr>
								</c:forEach>
							</table>
							<%--</form>--%>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</body>
</html>
