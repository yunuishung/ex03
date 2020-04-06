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
                            2020.03.31 게시판 Advanced Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        <form role="form" action=/board/register" method="post">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <tr>
                                    <td>title</td><td><input class="form-control" name="title"></td>
                                </tr>
                                <tr>
                                    <td>text area</td><td><textarea class="form-control" name="content"></textarea></td>
                                </tr>
                                <tr>
                                    <td>작성자</td><td><input class="form-control" name="writer"></td>
                                </tr>
                                <tr>
                                    <td colspan="2"><button type="submit" class="btn btn-default">Submit</button>
                                    <button type="reset" class="btn btn-default">Reset Button</button></td>
                                </tr>
                            </table>
                            </form>
                            <!-- /.table-responsive 
                            <div class="well">
                                <h4>DataTables Usage Information</h4>
                                <p>DataTables is a very flexible, advanced tables plugin for jQuery. In SB Admin, we are using a specialized version of DataTables built for Bootstrap 3. We have also customized the table headings to use Font Awesome icons in place of images. For complete documentation on DataTables, visit their website at <a target="_blank" href="https://datatables.net/">https://datatables.net/</a>.</p>
                                <a class="btn btn-default btn-lg btn-block" target="_blank" href="https://datatables.net/">View DataTables Documentation</a>
                            </div>-->
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