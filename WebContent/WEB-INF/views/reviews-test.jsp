<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
  window.onload = function () {
    require(["views/reviews-app"], function () {});
  };
</script>
<html>
    <head>
        <script data-main="/review-poc/app/main.js" src="/review-poc/lib/require.js"></script>
        <link rel="stylesheet" media="screen" href="/review-poc/styles/jquery-ui.css">
        <link rel="stylesheet" media="screen" href="/review-poc/styles/bootstrap.css">
        <link rel="stylesheet" media="screen" href="/review-poc/styles/reviews.css">
    </head>
    <body>
        <div class="js-reviews-main reviews-main">
        </div>
        
        <footer class="js-global-footer footer">
        </footer>
    </body>
</html>
