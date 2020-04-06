<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp" %>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Test Radio button </h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            2020.04.02 Test Select Radio button
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        
						<form action="/test/test22" method="post">
							<input type="radio" name="num1" value="한식"> 한식<br>
							<input type="radio" name="num1" value="중식"> 중식<br>
							<input type="radio" name="num1" value="일식"> 일식<br>
							<input type="radio" name="num1" value="양식"> 양식<br>
							메뉴를 선택해 주세요.<input type="submit" value="확인">
						</form>

                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            2020.04.02 Test Select Radio button
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        
						<form action="/test/test24" method="post">
							<input type="checkbox" name="num1" value="한식"> 한식<br>
							<input type="checkbox" name="num1" value="중식"> 중식<br>
							<input type="checkbox" name="num1" value="일식"> 일식<br>
							<input type="checkbox" name="num1" value="양식"> 양식<br>
							메뉴를 선택해 주세요.<input type="submit" value="확인">
						</form>

                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>

        </div>
        <!-- /#page-wrapper -->
        
<%@include file="../includes/footer.jsp" %>
