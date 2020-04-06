<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp" %>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Spring 게시판 만들기</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            2020.04.02 게시판 전체의 글 개수는 ${ counter} 개 입니다.
                            <br>관리자가 작성한 글의  개수는  ${ admin_scounter } 개 입니다.
                            <br>
                            <br> ${inputWritter} 가 작성한 글의  개수는  ${ search_counter } 개 입니다.
                            <br> 
                             
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
